# udpserver.py
from socket import *

host = ''  #listen all ip
port = 51697
bufsize = 1024
addr = (host,port)

udpServer = socket(AF_INET,SOCK_DGRAM)

udpServer.bind(addr)

while True:
    print('Waiting for connection...')
    passwd,addr = udpServer.recvfrom(bufsize) #�������ݺͷ��ص�ַ

    passwd=passwd.decode(encoding='utf-8')
#�ж������Ƿ���ȷ�� 
    #if passwd == '123456':
     #   response='correct'
   # else:
      #  response='false'
    #response = passwd.replace(' ','s')
    if '123456' == userlist(passwd):
        response = 'test'
    udpServer.sendto(response.encode(encoding='utf-8') ,addr)
    print('...recevied from and return to :',addr)
udpServer.close()


#�����ѯ
def userlist(name):
    with open('user.txt','r')as f:
        for line in f:
            [username,password] = line.split()
            if name == username:
                return password
    return None
