class Solution:
    def maxPartitionsAfterOperations(self, s: str, k: int) -> int:

        n = len(s)

        # Helper to count partitions greedily
        def countPartitions(st):
            seen = set()
            count = 0
            for c in st:
                seen.add(c)
                if len(seen) > k:
                    count += 1
                    seen = {c}
            return count + 1

        # Base: no change
        best = countPartitions(s)

        # Try changing each character
        for i in range(n):
            for ch in 'abcdefghijklmnopqrstuvwxyz':
                if ch == s[i]:
                    continue
                new_s = s[:i] + ch + s[i+1:]
                best = max(best, countPartitions(new_s))

        return best
