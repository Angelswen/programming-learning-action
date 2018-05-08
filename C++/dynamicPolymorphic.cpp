#include <iostream>
#include<string>
#define PI 3.1415926
using namespace std;

/**
* ��̬��̬��ʵ�֣��麯��Ӧ��
*/
class Student{
public:
    Student(string name):_name(name)
    {}

    virtual void display()
    {
        cout<<"name: "<<_name<<endl;
    }

protected:
    string _name;

};

class Graduate:public Student{
public:
    Graduate(string name,float pay):Student(name),_pay(pay)
    {}
    void display()
    {
        cout<<"name: "<<_name<<"  "<<"pay: "<<_pay<<endl;
    }

private:
    float _pay;

};

/**
* �������Ӧ��:�Զ�����������
* �ɲο����ϣ�https://blog.csdn.net/qq_32866009/article/details/51615509
*/

class Shape
{
public:
    virtual double area(){return 0.00;};
    virtual double volume(){return 0.00;};
};

class Point:public Shape
{
public:
    Point(double x,double y):_x(x),_y(y)
    {}
    double area(){return 0.00;}
    double volume(){return 0.00;}

protected:
    double _x,_y;
};

class Circle:public Shape
{
public:
    Circle(double x,double y,double r):
        _center(x,y),_r(r)
    {}
    double area(){return PI*_r*_r;}
    double volume(){return 0.00;}

protected:
    Point _center;//�����
    double _r;

};

class Cylinder:public Circle
{
public:
    Cylinder(double x,double y,double r,double h):
        Circle(x,y,r),_h(h)
    {}
    double area(){return 2*PI*_r*_r + 2*PI*_r*_h;}
    double volume(){return PI*_r*_r*_h;}

private:
    double _h;
};



int main()
{
    Student s("wang");
    Graduate g("huang",9600.00);

    Student& pt = s;
    pt.display();

    Student& ptr = g;
    ptr.display();

    Shape* sp;

    cout<<"the area of Point: "<<(sp=new Point(3.00,3.00))->area()<<endl;
    cout<<"the area of circle: "<<(sp=new Circle(3.00,3.00,4.00))->area()<<endl;
    cout<<"the area of cylinder"<<(sp=new Cylinder(3.00,3.00,4.00,2.00))->area()<<endl;
    cout<<"the area of cylinder"<<(sp=new Cylinder(3.00,3.00,4.00,2.00))->volume()<<endl;


    return 0;
}
