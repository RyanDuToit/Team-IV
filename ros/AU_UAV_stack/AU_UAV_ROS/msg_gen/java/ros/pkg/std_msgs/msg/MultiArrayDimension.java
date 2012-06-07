/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/MultiArrayDimension.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class MultiArrayDimension extends ros.communication.Message {

  public java.lang.String label = new java.lang.String();
  public long size;
  public long stride;

  public MultiArrayDimension() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/MultiArrayDimension"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "4cd0c83a8683deae40ecdac60e53bfa8"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string label   # label of given dimension\n" +
"uint32 size    # size of given dimension (in type units)\n" +
"uint32 stride  # stride of given dimension\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MultiArrayDimension clone() {
    MultiArrayDimension c = new MultiArrayDimension();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + label.length();
    __l += 4; // size
    __l += 4; // stride
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, label);
    bb.putInt((int)size);
    bb.putInt((int)stride);
  }

  public void deserialize(ByteBuffer bb) {
    label = Serialization.readString(bb);
    size = (long)(bb.getInt() & 0xffffffff);
    stride = (long)(bb.getInt() & 0xffffffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MultiArrayDimension))
      return false;
    MultiArrayDimension other = (MultiArrayDimension) o;
    return
      label.equals(other.label) &&
      size == other.size &&
      stride == other.stride &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.label == null ? 0 : this.label.hashCode());
    result = prime * result + (int)(this.size ^ (this.size >>> 32));
    result = prime * result + (int)(this.stride ^ (this.stride >>> 32));
    return result;
  }
} // class MultiArrayDimension

