def read_weights_biases(filename):
    weight_mat = [] #empty list to store weight matrices
    bias_mat = [] #empty list to store biases matrices
    with open("example_weights_biases.txt") as file: #open the file
        lines = file.read().splitlines() #read data and split in to lines

    temp_arr = []
    flag = ""
    count=0
    for line in lines: #iterate over each line skipping the first line - "#"
        count=count+1
        if(count==len(lines)):
            bias_mat.append(temp_arr)

        if line.startswith ("#w"):
            if flag == "b":
                bias_mat.append(temp_arr)
                temp_arr=[]
            flag = "w"
            
            continue
            # print(line.next())
        if line.startswith ("#b"):
            if flag == "w":
                weight_mat.append(temp_arr)
                temp_arr=[]
            flag = "b"
            continue
        if flag == "b":
            print("bbbb " + line)
            temp_arr.append(line.split(','))
            # bias_mat.append(temp_arr)
            continue
        if flag == "w":
            # temp_arr = []
            print("www " + line)
            temp_arr.append(line.split(',')) 
            # weight_mat.append(temp_arr)
            continue


    return weight_mat, bias_mat

w,b=read_weights_biases('example_weights_biases.txt')
print(w)
print(b)