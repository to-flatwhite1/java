package frame;
import java.awt.*;
import java.awt.event.*;
public class Sample01 extends Frame{
	Sample01(){
		//setTitle("화면만들기");
		super("이것도 가능");
		Button b=new Button("click!");//버튼 객체,Component
		b.setBounds(100,40,100,60); //크기 위치조절(X좌표,Y좌표,너비,높이)
		
		//객체.addActionListener 해당 객체가 특정 동작에 반응하도록 설정
		b.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(b);				//생성된 Component객체를 Container에 연결하는 메서드
		setSize(300,300);	//창 크기조절(가로,세로)
		setLayout(null);	//화면 배치 규칙
		setVisible(true);	//화면이 눈에 보이도록 설정
	}
	public static void main(String [] args) {
		new Sample01();
	}//main끝
}//class끝
//Frame: 윈도우 창
//Component: 레이아웃에 배치될 수 있는 요소,버튼,문자,그림 등등
//Container:요소들을 감쌀 수 있는 가상의 상자
//Panel:Container 내부에 배치되는 Container,
//		Container이자 Component의 역할 수행
//Layout:화면 배치 규칙,무규칙일 경우에만 자유 배치 가능