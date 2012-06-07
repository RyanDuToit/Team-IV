/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/visualization_msgs/msg/MenuEntry.msg */

package ros.pkg.visualization_msgs.msg;

import java.nio.ByteBuffer;

public class MenuEntry extends ros.communication.Message {
  static public final short FEEDBACK = 0;
  static public final short ROSRUN = 1;
  static public final short ROSLAUNCH = 2;

  public long id;
  public long parent_id;
  public java.lang.String title = new java.lang.String();
  public java.lang.String command = new java.lang.String();
  public short command_type;

  public MenuEntry() {
  }

  public static java.lang.String __s_getDataType() { return "visualization_msgs/MenuEntry"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "b90ec63024573de83b57aa93eb39be2d"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# MenuEntry message.\n" +
"\n" +
"# Each InteractiveMarker message has an array of MenuEntry messages.\n" +
"# A collection of MenuEntries together describe a\n" +
"# menu/submenu/subsubmenu/etc tree, though they are stored in a flat\n" +
"# array.  The tree structure is represented by giving each menu entry\n" +
"# an ID number and a \"parent_id\" field.  Top-level entries are the\n" +
"# ones with parent_id = 0.  Menu entries are ordered within their\n" +
"# level the same way they are ordered in the containing array.  Parent\n" +
"# entries must appear before their children.\n" +
"\n" +
"# Example:\n" +
"# - id = 3\n" +
"#   parent_id = 0\n" +
"#   title = \"fun\"\n" +
"# - id = 2\n" +
"#   parent_id = 0\n" +
"#   title = \"robot\"\n" +
"# - id = 4\n" +
"#   parent_id = 2\n" +
"#   title = \"pr2\"\n" +
"# - id = 5\n" +
"#   parent_id = 2\n" +
"#   title = \"turtle\"\n" +
"#\n" +
"# Gives a menu tree like this:\n" +
"#  - fun\n" +
"#  - robot\n" +
"#    - pr2\n" +
"#    - turtle\n" +
"\n" +
"# ID is a number for each menu entry.  Must be unique within the\n" +
"# control, and should never be 0.\n" +
"uint32 id\n" +
"\n" +
"# ID of the parent of this menu entry, if it is a submenu.  If this\n" +
"# menu entry is a top-level entry, set parent_id to 0.\n" +
"uint32 parent_id\n" +
"\n" +
"# menu / entry title\n" +
"string title\n" +
"\n" +
"# Arguments to command indicated by command_type (below)\n" +
"string command\n" +
"\n" +
"# Command_type stores the type of response desired when this menu\n" +
"# entry is clicked.\n" +
"# FEEDBACK: send an InteractiveMarkerFeedback message with menu_entry_id set to this entry's id.\n" +
"# ROSRUN: execute \"rosrun\" with arguments given in the command field (above).\n" +
"# ROSLAUNCH: execute \"roslaunch\" with arguments given in the command field (above).\n" +
"uint8 FEEDBACK=0\n" +
"uint8 ROSRUN=1\n" +
"uint8 ROSLAUNCH=2\n" +
"uint8 command_type\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MenuEntry clone() {
    MenuEntry c = new MenuEntry();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4; // id
    __l += 4; // parent_id
    __l += 4 + title.length();
    __l += 4 + command.length();
    __l += 1; // command_type
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt((int)id);
    bb.putInt((int)parent_id);
    Serialization.writeString(bb, title);
    Serialization.writeString(bb, command);
    bb.put((byte)command_type);
  }

  public void deserialize(ByteBuffer bb) {
    id = (long)(bb.getInt() & 0xffffffff);
    parent_id = (long)(bb.getInt() & 0xffffffff);
    title = Serialization.readString(bb);
    command = Serialization.readString(bb);
    command_type = (short)(bb.get() & 0xff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MenuEntry))
      return false;
    MenuEntry other = (MenuEntry) o;
    return
      id == other.id &&
      parent_id == other.parent_id &&
      title.equals(other.title) &&
      command.equals(other.command) &&
      command_type == other.command_type &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.id ^ (this.id >>> 32));
    result = prime * result + (int)(this.parent_id ^ (this.parent_id >>> 32));
    result = prime * result + (this.title == null ? 0 : this.title.hashCode());
    result = prime * result + (this.command == null ? 0 : this.command.hashCode());
    result = prime * result + this.command_type;
    return result;
  }
} // class MenuEntry

