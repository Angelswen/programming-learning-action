#include<ostream>
#include"Matrix.h"

using namespace std;

int main(){

	Matrix<double ,2,2>md1,md2;
	Matrix<int ,3,3> mi1,mi2;
	Matrix<float,4,4>mf1,mf2;

    cout<<"������2*2��double����"<<endl;
	md1.input();
	md2 = md1;
	cout<<"���md1:"<<endl;
	md1.print();
	cout<<endl;
	cout<<"���md2:�������캯��"<<endl;
	md2.print();

    cout<<endl;
	cout<<"������3*3��int����"<<endl;
	mi1.input();
	mi2 = mi1;
	cout<<"���mi1:"<<endl;
	mi1.print();
	cout<<endl;
	cout<<"���mi2:�������캯��"<<endl;
	mi2.print();

    cout<<endl;
	cout<<"������4*4��float����"<<endl;
	mf1.input();
	mf2 = mf1;
	cout<<"���mf1:"<<endl;
	mf1.print();
	cout<<endl;
	cout<<"���mf2:�������캯��"<<endl;
	mf2.print();





	return 0;
}
