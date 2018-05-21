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

response = response.decode(encoding='utf-8') #��utf-8�ĸ�ʽ����
print(response,'from',addr) #��ʾ�������ķ��ؽ��

with open(file,'w') as f:
    f.write(response)

udpClient.close() #�رտͻ���

#
