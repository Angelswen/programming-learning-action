#include<ostream>
#include"Matrix.h"

using namespace std;

int main(){

	Matrix<double ,2,2>md1,md2;
	Matrix<int ,3,3> mi1,mi2;
	Matrix<float,4,4>mf1,mf2;

    cout<<"请输入2*2个double型数"<<endl;
	md1.input();
	md2 = md1;
	cout<<"输出md1:"<<endl;
	md1.print();
	cout<<endl;
	cout<<"输出md2:拷贝构造函数"<<endl;
	md2.print();

    cout<<endl;
	cout<<"请输入3*3个int型数"<<endl;
	mi1.input();
	mi2 = mi1;
	cout<<"输出mi1:"<<endl;
	mi1.print();
	cout<<endl;
	cout<<"输出mi2:拷贝构造函数"<<endl;
	mi2.print();

    cout<<endl;
	cout<<"请输入4*4个float型数"<<endl;
	mf1.input();
	mf2 = mf1;
	cout<<"输出mf1:"<<endl;
	mf1.print();
	cout<<endl;
	cout<<"输出mf2:拷贝构造函数"<<endl;
	mf2.print();





	return 0;
}
