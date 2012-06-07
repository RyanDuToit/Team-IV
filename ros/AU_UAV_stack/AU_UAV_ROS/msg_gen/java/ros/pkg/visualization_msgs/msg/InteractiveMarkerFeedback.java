/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/visualization_msgs/msg/InteractiveMarkerFeedback.msg */

package ros.pkg.visualization_msgs.msg;

import java.nio.ByteBuffer;

public class InteractiveMarkerFeedback extends ros.communication.Message {
  static public final short KEEP_ALIVE = 0;
  static public final short POSE_UPDATE = 1;
  static public final short MENU_SELECT = 2;
  static public final short BUTTON_CLICK = 3;
  static public final short MOUSE_DOWN = 4;
  static public final short MOUSE_UP = 5;

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public java.lang.String client_id = new java.lang.String();
  public java.lang.String marker_name = new java.lang.String();
  public java.lang.String control_name = new java.lang.String();
  public short event_type;
  public ros.pkg.geometry_msgs.msg.Pose pose = new ros.pkg.geometry_msgs.msg.Pose();
  public long menu_entry_id;
  public ros.pkg.geometry_msgs.msg.Point mouse_point = new ros.pkg.geometry_msgs.msg.Point();
  public boolean mouse_point_valid;

  public InteractiveMarkerFeedback() {
  }

  public static java.lang.String __s_getDataType() { return "visualization_msgs/InteractiveMarkerFeedback"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "ab0f1eee058667e28c19ff3ffc3f4b78"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Time/frame info.\n" +
"Header header\n" +
"\n" +
"# Identifying string. Must be unique in the topic namespace.\n" +
"string client_id\n" +
"\n" +
"# Feedback message sent back from the GUI, e.g.\n" +
"# when the status of an interactive marker was modified by the user.\n" +
"\n" +
"# Specifies which interactive marker and control this message refers to\n" +
"string marker_name\n" +
"string control_name\n" +
"\n" +
"# Type of the event\n" +
"# KEEP_ALIVE: sent while dragging to keep up control of the marker\n" +
"# MENU_SELECT: a menu entry has been selected\n" +
"# BUTTON_CLICK: a button control has been clicked\n" +
"# POSE_UPDATE: the pose has been changed using one of the controls\n" +
"uint8 KEEP_ALIVE = 0\n" +
"uint8 POSE_UPDATE = 1\n" +
"uint8 MENU_SELECT = 2\n" +
"uint8 BUTTON_CLICK = 3\n" +
"\n" +
"uint8 MOUSE_DOWN = 4\n" +
"uint8 MOUSE_UP = 5\n" +
"\n" +
"uint8 event_type\n" +
"\n" +
"# Current pose of the marker\n" +
"# Note: Has to be valid for all feedback types.\n" +
"geometry_msgs/Pose pose\n" +
"\n" +
"# Contains the ID of the selected menu entry\n" +
"# Only valid for MENU_SELECT events.\n" +
"uint32 menu_entry_id\n" +
"\n" +
"# If event_type is BUTTON_CLICK, MOUSE_DOWN, or MOUSE_UP, mouse_point\n" +
"# may contain the 3 dimensional position of the event on the\n" +
"# control.  If it does, mouse_point_valid will be true.  mouse_point\n" +
"# will be relative to the frame listed in the header.\n" +
"geometry_msgs/Point mouse_point\n" +
"bool mouse_point_valid\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
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
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
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

  public InteractiveMarkerFeedback clone() {
    InteractiveMarkerFeedback c = new InteractiveMarkerFeedback();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4 + client_id.length();
    __l += 4 + marker_name.length();
    __l += 4 + control_name.length();
    __l += 1; // event_type
    __l += pose.serializationLength();
    __l += 4; // menu_entry_id
    __l += mouse_point.serializationLength();
    __l += 1; // mouse_point_valid
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    Serialization.writeString(bb, client_id);
    Serialization.writeString(bb, marker_name);
    Serialization.writeString(bb, control_name);
    bb.put((byte)event_type);
    pose.serialize(bb, seq);
    bb.putInt((int)menu_entry_id);
    mouse_point.serialize(bb, seq);
    bb.put((byte)(mouse_point_valid ? 1 : 0));
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    client_id = Serialization.readString(bb);
    marker_name = Serialization.readString(bb);
    control_name = Serialization.readString(bb);
    event_type = (short)(bb.get() & 0xff);
    pose.deserialize(bb);
    menu_entry_id = (long)(bb.getInt() & 0xffffffff);
    mouse_point.deserialize(bb);
    mouse_point_valid = bb.get() != 0 ? true : false;
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof InteractiveMarkerFeedback))
      return false;
    InteractiveMarkerFeedback other = (InteractiveMarkerFeedback) o;
    return
      header.equals(other.header) &&
      client_id.equals(other.client_id) &&
      marker_name.equals(other.marker_name) &&
      control_name.equals(other.control_name) &&
      event_type == other.event_type &&
      pose.equals(other.pose) &&
      menu_entry_id == other.menu_entry_id &&
      mouse_point.equals(other.mouse_point) &&
      mouse_point_valid == other.mouse_point_valid &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.client_id == null ? 0 : this.client_id.hashCode());
    result = prime * result + (this.marker_name == null ? 0 : this.marker_name.hashCode());
    result = prime * result + (this.control_name == null ? 0 : this.control_name.hashCode());
    result = prime * result + this.event_type;
    result = prime * result + (this.pose == null ? 0 : this.pose.hashCode());
    result = prime * result + (int)(this.menu_entry_id ^ (this.menu_entry_id >>> 32));
    result = prime * result + (this.mouse_point == null ? 0 : this.mouse_point.hashCode());
    result = prime * result + (this.mouse_point_valid ? 1231 : 1237);
    return result;
  }
} // class InteractiveMarkerFeedback

