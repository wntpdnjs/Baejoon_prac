def solution(name, yearning, photo):
    answer = []
    sum = 0
    for i in range(0,len(photo)):
        sum = 0
        for j in range (len(name)):
            if name[j] in photo[i] :
                sum +=  yearning[j]
        answer.append(sum)
               

    return answer