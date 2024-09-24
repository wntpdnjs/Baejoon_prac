list_word=[]
list_len=[]
list_result=[]

for i in range(5) :
        word = list(input())
        list_word.append(word)
        list_len.append(len(word))
max_num = max(list_len)
for i in range (max_num) :
        for j in range(5):
                if i < list_len[j] :
                        list_result.append(list_word[j][i])
                else :
                        pass

for i in list_result :
        print(i,end="")
                
   
                        
                
             