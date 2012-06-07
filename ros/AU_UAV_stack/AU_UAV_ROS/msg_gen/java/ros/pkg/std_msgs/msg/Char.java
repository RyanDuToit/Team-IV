/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/Char.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class Char extends ros.communication.Message {

  public char data;

  public Char() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/Char"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "1bf77f25acecdedba0e224b162199717"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "char data\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Char clone() {
    Char c = new Char();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 1; // data
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)data);
  }

  public void deserialize(ByteBuffer bb) {
    data = (char)(bb.get() & 0xff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Char))
      return false;
    Char other = (Char) o;
    return
      data == other.data &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + this.data;
    return result;
  }
} // class Char

