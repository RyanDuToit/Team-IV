/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/UInt8.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class UInt8 extends ros.communication.Message {

  public short data;

  public UInt8() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/UInt8"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "7c8164229e7d2c17eb95e9231617fdee"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "uint8 data\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public UInt8 clone() {
    UInt8 c = new UInt8();
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
    data = (short)(bb.get() & 0xff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof UInt8))
      return false;
    UInt8 other = (UInt8) o;
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
} // class UInt8

