/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/geometry_msgs/msg/Pose.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class Pose extends ros.communication.Message {

  public ros.pkg.geometry_msgs.msg.Point position = new ros.pkg.geometry_msgs.msg.Point();
  public ros.pkg.geometry_msgs.msg.Quaternion orientation = new ros.pkg.geometry_msgs.msg.Quaternion();

  public Pose() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/Pose"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "e45d45a5a1ce597b249e23fb30fc871f"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Pose clone() {
    Pose c = new Pose();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += position.serializationLength();
    __l += orientation.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    position.serialize(bb, seq);
    orientation.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    position.deserialize(bb);
    orientation.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Pose))
      return false;
    Pose other = (Pose) o;
    return
      position.equals(other.position) &&
      orientation.equals(other.orientation) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.position == null ? 0 : this.position.hashCode());
    result = prime * result + (this.orientation == null ? 0 : this.orientation.hashCode());
    return result;
  }
} // class Pose

