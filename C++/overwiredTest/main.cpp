#include<ostream>
#include"Matrix.h"
using namespace std;

int main(){

	Matrix m1,m2,m3,m4,m5;
	m1.input();
	m2.input();
	m3 = m1+m2;
	m4 = m1-m2;
	m5 = m2;
	cout<<"���ԣ�m1+m2="<<endl;
	cout<<m3;
	cout<<endl;
	cout<<"���ԣ�m1-m2"<<endl;
	cout<<m4;
    cout<<endl;
	cout<<"���ԣ����ƹ��캯��:"<<endl;
	cout<<m5;
	return 0;

}
