info = ["java backend junior pizza 150",
        "python frontend senior chicken 210",
        "python frontend senior chicken 150",
        "cpp backend senior pizza 260",
        "java backend junior chicken 80",
        "python backend senior chicken 50"]
query = ["java and backend and junior and pizza 100",
         "python and frontend and senior and chicken 200",
         "cpp and - and senior and pizza 250",
         "- and backend and senior and - 150",
         "- and - and - and chicken 100",
         "- and - and - and - 150"]
def solution(info,query):
    infosplit = []
    querysplit = []
    for i in info:
        infosplit.append(i.split()) #info를 공백으로 구분
    for i in range(len(query)):
        q = query[i].replace("and", "").replace("  ", " ").split()
        querysplit.append(q)
        #[["-","backend",...],["-","-"...
    result = [0 for i in range(len(query))]
    for i in range(len(query)): #결과값의 수
        for j in infosplit: #qurey마다 info의 list 개수만큼 비교
            for k in range(len(j)): #infosplit list의 요소 개수만큼
                if querysplit[i][k] == "-":
                    continue
                elif k == 4:
                    if int(j[k]) >= int(querysplit[i][k]):
                        result[i] += 1
                elif j[k] != querysplit[i][k]:
                    break

    return result

print(solution(info,query))