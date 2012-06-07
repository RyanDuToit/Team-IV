/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/sensor_msgs/msg/NavSatStatus.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class NavSatStatus extends ros.communication.Message {
  static public final byte STATUS_NO_FIX = -1;
  static public final byte STATUS_FIX = 0;
  static public final byte STATUS_SBAS_FIX = 1;
  static public final byte STATUS_GBAS_FIX = 2;
  static public final int SERVICE_GPS = 1;
  static public final int SERVICE_GLONASS = 2;
  static public final int SERVICE_COMPASS = 4;
  static public final int SERVICE_GALILEO = 8;

  public byte status;
  public int service;

  public NavSatStatus() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/NavSatStatus"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "331cdbddfa4bc96ffc3b9ad98900a54c"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Navigation Satellite fix status for any Global Navigation Satellite System\n" +
"\n" +
"# Whether to output an augmented fix is determined by both the fix\n" +
"# type and the last time differential corrections were received.  A\n" +
"# fix is valid when status >= STATUS_FIX.\n" +
"\n" +
"int8 STATUS_NO_FIX =  -1        # unable to fix position\n" +
"int8 STATUS_FIX =      0        # unaugmented fix\n" +
"int8 STATUS_SBAS_FIX = 1        # with satellite-based augmentation\n" +
"int8 STATUS_GBAS_FIX = 2        # with ground-based augmentation\n" +
"\n" +
"int8 status\n" +
"\n" +
"# Bits defining which Global Navigation Satellite System signals were\n" +
"# used by the receiver.\n" +
"\n" +
"uint16 SERVICE_GPS =     1\n" +
"uint16 SERVICE_GLONASS = 2\n" +
"uint16 SERVICE_COMPASS = 4      # includes BeiDou.\n" +
"uint16 SERVICE_GALILEO = 8\n" +
"\n" +
"uint16 service\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public NavSatStatus clone() {
    NavSatStatus c = new NavSatStatus();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 1; // status
    __l += 2; // service
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put(status);
    bb.putShort((short)service);
  }

  public void deserialize(ByteBuffer bb) {
    status = bb.get();
    service = (int)(bb.getShort() & 0xffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof NavSatStatus))
      return false;
    NavSatStatus other = (NavSatStatus) o;
    return
      status == other.status &&
      service == other.service &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + this.status;
    result = prime * result + this.service;
    return result;
  }
} // class NavSatStatus

