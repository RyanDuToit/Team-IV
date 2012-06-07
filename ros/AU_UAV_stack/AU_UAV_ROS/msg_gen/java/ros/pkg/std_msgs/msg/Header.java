/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/Header.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class Header extends ros.communication.Message {

  public long seq;
  public ros.communication.Time stamp = new ros.communication.Time();
  public java.lang.String frame_id = new java.lang.String();

  public Header() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/Header"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "2176decaecbce78abc3b96ef049fabed"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Header clone() {
    Header c = new Header();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4; // seq
    __l += 8; // stamp
    __l += 4 + frame_id.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt((int)seq);
    Serialization.writeTime(bb, stamp);
    Serialization.writeString(bb, frame_id);
  }

  public void deserialize(ByteBuffer bb) {
    seq = (long)(bb.getInt() & 0xffffffff);
    stamp = Serialization.readTime(bb);
    frame_id = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Header))
      return false;
    Header other = (Header) o;
    return
      seq == other.seq &&
      stamp.equals(other.stamp) &&
      frame_id.equals(other.frame_id) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.seq ^ (this.seq >>> 32));
    result = prime * result + (this.stamp == null ? 0 : this.stamp.hashCode());
    result = prime * result + (this.frame_id == null ? 0 : this.frame_id.hashCode());
    return result;
  }
} // class Header

