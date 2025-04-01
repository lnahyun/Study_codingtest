import re

def solution(file):
    def parsing(f):
        match = re.match(r"([a-zA-Z\s.-]+)(\d+)", f)
        head, number = match.groups()
        return (head.lower(), int(number))

    answer = sorted(file, key=parsing)
    return answer

file1 = ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]
file2 = ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"]

print(solution(file1))
print(solution(file2))
