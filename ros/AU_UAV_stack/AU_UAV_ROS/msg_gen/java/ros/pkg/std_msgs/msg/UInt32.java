/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/UInt32.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class UInt32 extends ros.communication.Message {

  public long data;

  public UInt32() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/UInt32"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "304a39449588c7f8ce2df6e8001c5fce"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "uint32 data\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public UInt32 clone() {
    UInt32 c = new UInt32();
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
    bb.putInt((int)data);
  }

  public void deserialize(ByteBuffer bb) {
    data = (long)(bb.getInt() & 0xffffffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof UInt32))
      return false;
    UInt32 other = (UInt32) o;
    return
      data == other.data &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.data ^ (this.data >>> 32));
    return result;
  }
} // class UInt32

