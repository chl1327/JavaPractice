package TkJava.TKU14.secret;

import static print.Print.println;

class Secret implements A {
	public void e() { println("public Secret.e()"); }
	void f() { println("package Secret.f()"); }
	protected void g() { println("protected Secret.g()"); }
	private void h() { println("private Secret.h()"); }
 }

 public class SecretMaker {
	public static A makeSecret() { return new Secret();  }
}
