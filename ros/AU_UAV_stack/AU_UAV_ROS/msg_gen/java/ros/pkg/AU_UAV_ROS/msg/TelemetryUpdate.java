/* Auto-generated by genmsg_java.py for file /home/uav-team3/AU-UAV-ROS/AU_UAV_stack/AU_UAV_ROS/msg/TelemetryUpdate.msg */

package ros.pkg.AU_UAV_ROS.msg;

import java.nio.ByteBuffer;

public class TelemetryUpdate extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header telemetryHeader = new ros.pkg.std_msgs.msg.Header();
  public int planeID;
  public double currentLatitude;
  public double currentLongitude;
  public double currentAltitude;
  public double destLatitude;
  public double destLongitude;
  public double destAltitude;
  public double groundSpeed;
  public double targetBearing;
  public long currentWaypointIndex;
  public double distanceToDestination;

  public TelemetryUpdate() {
  }

  public static java.lang.String __s_getDataType() { return "AU_UAV_ROS/TelemetryUpdate"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "53cd950963d7a5c403c785f8c0a2ffa7"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "Header telemetryHeader\n" +
"int32 planeID\n" +
"float64 currentLatitude\n" +
"float64 currentLongitude\n" +
"float64 currentAltitude\n" +
"float64 destLatitude\n" +
"float64 destLongitude\n" +
"float64 destAltitude\n" +
"float64 groundSpeed\n" +
"float64 targetBearing\n" +
"int64 currentWaypointIndex\n" +
"float64 distanceToDestination\n" +
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
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public TelemetryUpdate clone() {
    TelemetryUpdate c = new TelemetryUpdate();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += telemetryHeader.serializationLength();
    __l += 4; // planeID
    __l += 8; // currentLatitude
    __l += 8; // currentLongitude
    __l += 8; // currentAltitude
    __l += 8; // destLatitude
    __l += 8; // destLongitude
    __l += 8; // destAltitude
    __l += 8; // groundSpeed
    __l += 8; // targetBearing
    __l += 8; // currentWaypointIndex
    __l += 8; // distanceToDestination
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    telemetryHeader.serialize(bb, seq);
    bb.putInt(planeID);
    bb.putDouble(currentLatitude);
    bb.putDouble(currentLongitude);
    bb.putDouble(currentAltitude);
    bb.putDouble(destLatitude);
    bb.putDouble(destLongitude);
    bb.putDouble(destAltitude);
    bb.putDouble(groundSpeed);
    bb.putDouble(targetBearing);
    bb.putLong(currentWaypointIndex);
    bb.putDouble(distanceToDestination);
  }

  public void deserialize(ByteBuffer bb) {
    telemetryHeader.deserialize(bb);
    planeID = bb.getInt();
    currentLatitude = bb.getDouble();
    currentLongitude = bb.getDouble();
    currentAltitude = bb.getDouble();
    destLatitude = bb.getDouble();
    destLongitude = bb.getDouble();
    destAltitude = bb.getDouble();
    groundSpeed = bb.getDouble();
    targetBearing = bb.getDouble();
    currentWaypointIndex = bb.getLong();
    distanceToDestination = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof TelemetryUpdate))
      return false;
    TelemetryUpdate other = (TelemetryUpdate) o;
    return
      telemetryHeader.equals(other.telemetryHeader) &&
      planeID == other.planeID &&
      currentLatitude == other.currentLatitude &&
      currentLongitude == other.currentLongitude &&
      currentAltitude == other.currentAltitude &&
      destLatitude == other.destLatitude &&
      destLongitude == other.destLongitude &&
      destAltitude == other.destAltitude &&
      groundSpeed == other.groundSpeed &&
      targetBearing == other.targetBearing &&
      currentWaypointIndex == other.currentWaypointIndex &&
      distanceToDestination == other.distanceToDestination &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.telemetryHeader == null ? 0 : this.telemetryHeader.hashCode());
    result = prime * result + this.planeID;
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.currentLatitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.currentLongitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.currentAltitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.destLatitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.destLongitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.destAltitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.groundSpeed)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.targetBearing)) ^ (tmp >>> 32));
    result = prime * result + (int)(this.currentWaypointIndex ^ (this.currentWaypointIndex >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.distanceToDestination)) ^ (tmp >>> 32));
    return result;
  }
} // class TelemetryUpdate

