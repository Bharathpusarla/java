package NonStatic;

public class Outer  {

		public static void main(String[] args) {
			Outer obj = new Outer();
			obj.f1();
			
			Outer.Inner obj2 = obj.new Inner();
			obj2.f2();
			
		}

		void f1() {
			System.out.println("Non-Static Method: Outer.f1()");
		}
		
		class Inner {
			void f2() {
				System.out.println("Non-static Inner class non-static method");
			}
		}

	}


