def minWindow(s: str, t: str):
        map = dict()
        for i in t:
            map[i] = map.get(i, 0) + 1

        i = 0
        j = 0
        min_length = float("inf")
        start = 0
        count = len(map.keys())

        while j < len(s):
            print(map)
            print(map.get(s[j], len(t)))
            if map.get(s[j], len(t)) != len(t):
                
                print(s[j])
                map[s[j]] -= 1
                if map[s[j]] == 0:
                    count -= 1
                    print("count", count)

            while count == 0:
                print(map)
                if map.get(s[i], len(t)) <= 0:
                    print(s[i])
                    map[s[i]] += 1
                    if map[s[i]] == 1:
                        count += 1
                        if min_length > (j - i + 1):
                            min_length = j - i + 1
                            start = i
                            print(start,"start")

                i += 1
            j += 1
        if min_length == float("inf"):
            return ""
        return s[start : start + min_length]

s= "A"
t = "A"
x = minWindow(s,t)
print("ans",x)