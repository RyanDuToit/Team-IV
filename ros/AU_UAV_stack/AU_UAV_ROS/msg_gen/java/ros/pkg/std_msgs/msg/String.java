/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/String.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class String extends ros.communication.Message {

  public java.lang.String data = new java.lang.String();

  public String() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/String"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "992ce8a1687cec8c8bd883ec73ca41d1"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string data\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public String clone() {
    String c = new String();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + data.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, data);
  }

  public void deserialize(ByteBuffer bb) {
    data = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof String))
      return false;
    String other = (String) o;
    return
      data.equals(other.data) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.data == null ? 0 : this.data.hashCode());
    return result;
  }
} // class String

