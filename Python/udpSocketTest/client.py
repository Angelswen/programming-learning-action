# udpclient.py
from socket import *
file = 'pswd.txt'
#read the pswd file
with open(file,'r') as f:
    passwd = f.read()
#f.close()

host = '127.0.0.1'  #ip
port = 51697       #port
bufsize = 1024      #buffer
addr = (host,port)
udpClient = socket(AF_INET,SOCK_DGRAM) #new client

passwd = passwd.encode(encoding="utf-8") #encoder
udpClient.sendto(passwd,addr)  #send the data

response,addr = udpClient.recvfrom(bufsize) #

response = response.decode(encoding='utf-8') #用utf-8的格式解码
print(response,'from',addr) #显示服务器的返回结果

with open(file,'w') as f:
    f.write(response)

udpClient.close() #关闭客户端

#
