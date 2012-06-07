/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/Int32.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class Int32 extends ros.communication.Message {

  public int data;

  public Int32() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/Int32"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "da5909fbe378aeaf85e547e830cc1bb7"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "int32 data\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Int32 clone() {
    Int32 c = new Int32();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4; // data
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(data);
  }

  public void deserialize(ByteBuffer bb) {
    data = bb.getInt();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Int32))
      return false;
    Int32 other = (Int32) o;
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
} // class Int32

