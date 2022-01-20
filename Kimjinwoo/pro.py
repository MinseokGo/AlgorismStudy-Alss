info = ["a v c","d v","k v" ]
a = []
for i in info:
    a.append(i.split())
print(a)
def solution(info,query):
    infosplit = []
    querysplit = []
    for i in info:
        infosplit.append(i.split()) #info를 공백으로 구분
    for i in query:
        i = i.split() #쿼리에서 and를 제거하기 위해 공백으로 구분
        for _ in range(3):
            i.remove("and") #and 제거
        querysplit.append(i)

    result = [0 for i in range(len(query))]