package java1;

public class Student1
{
	
		public int sid;  // sid is instance variable
		public String sname; // sname is instance variable
		
		public Student1(int sid,String sname) {
			this.sid=sid;
			this.sname=sname;
		}

		public int getSid() {
			return sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}
		
	}

