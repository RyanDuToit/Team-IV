/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/sensor_msgs/msg/Imu.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class Imu extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.geometry_msgs.msg.Quaternion orientation = new ros.pkg.geometry_msgs.msg.Quaternion();
  public double[] orientation_covariance = new double[9];
  public ros.pkg.geometry_msgs.msg.Vector3 angular_velocity = new ros.pkg.geometry_msgs.msg.Vector3();
  public double[] angular_velocity_covariance = new double[9];
  public ros.pkg.geometry_msgs.msg.Vector3 linear_acceleration = new ros.pkg.geometry_msgs.msg.Vector3();
  public double[] linear_acceleration_covariance = new double[9];

  public Imu() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/Imu"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "6a62c6daae103f4ff57a132d6f95cec2"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This is a message to hold data from an IMU (Inertial Measurement Unit)\n" +
"#\n" +
"# Accelerations should be in m/s^2 (not in g's), and rotational velocity should be in rad/sec\n" +
"#\n" +
"# If the covariance of the measurement is known, it should be filled in (if all you know is the variance of each measurement, e.g. from the datasheet, just put those along the diagonal)\n" +
"# A covariance matrix of all zeros will be interpreted as \"covariance unknown\", and to use the data a covariance will have to be assumed or gotten from some other source\n" +
"#\n" +
"# If you have no estimate for one of the data elements (e.g. your IMU doesn't produce an orientation estimate), please set element 0 of the associated covariance matrix to -1\n" +
"# If you are interpreting this message, please check for a value of -1 in the first element of each covariance matrix, and disregard the associated estimate.\n" +
"\n" +
"Header header\n" +
"\n" +
"geometry_msgs/Quaternion orientation\n" +
"float64[9] orientation_covariance # Row major about x, y, z axes\n" +
"\n" +
"geometry_msgs/Vector3 angular_velocity\n" +
"float64[9] angular_velocity_covariance # Row major about x, y, z axes\n" +
"\n" +
"geometry_msgs/Vector3 linear_acceleration\n" +
"float64[9] linear_acceleration_covariance # Row major x, y z \n" +
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
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Imu clone() {
    Imu c = new Imu();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += orientation.serializationLength();
    __l += 72; // orientation_covariance
    __l += angular_velocity.serializationLength();
    __l += 72; // angular_velocity_covariance
    __l += linear_acceleration.serializationLength();
    __l += 72; // linear_acceleration_covariance
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    orientation.serialize(bb, seq);

    for(double val : orientation_covariance) {
      bb.putDouble(val);
    }
    angular_velocity.serialize(bb, seq);

    for(double val : angular_velocity_covariance) {
      bb.putDouble(val);
    }
    linear_acceleration.serialize(bb, seq);

    for(double val : linear_acceleration_covariance) {
      bb.putDouble(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    orientation.deserialize(bb);

    int __orientation_covariance_len = orientation_covariance.length;;
    orientation_covariance = new double[__orientation_covariance_len];
    for(int __i=0; __i<__orientation_covariance_len; __i++) {
      orientation_covariance[__i] = bb.getDouble();
    }
    angular_velocity.deserialize(bb);

    int __angular_velocity_covariance_len = angular_velocity_covariance.length;;
    angular_velocity_covariance = new double[__angular_velocity_covariance_len];
    for(int __i=0; __i<__angular_velocity_covariance_len; __i++) {
      angular_velocity_covariance[__i] = bb.getDouble();
    }
    linear_acceleration.deserialize(bb);

    int __linear_acceleration_covariance_len = linear_acceleration_covariance.length;;
    linear_acceleration_covariance = new double[__linear_acceleration_covariance_len];
    for(int __i=0; __i<__linear_acceleration_covariance_len; __i++) {
      linear_acceleration_covariance[__i] = bb.getDouble();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Imu))
      return false;
    Imu other = (Imu) o;
    return
      header.equals(other.header) &&
      orientation.equals(other.orientation) &&
      java.util.Arrays.equals(orientation_covariance, other.orientation_covariance) &&
      angular_velocity.equals(other.angular_velocity) &&
      java.util.Arrays.equals(angular_velocity_covariance, other.angular_velocity_covariance) &&
      linear_acceleration.equals(other.linear_acceleration) &&
      java.util.Arrays.equals(linear_acceleration_covariance, other.linear_acceleration_covariance) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.orientation == null ? 0 : this.orientation.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.orientation_covariance);
    result = prime * result + (this.angular_velocity == null ? 0 : this.angular_velocity.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.angular_velocity_covariance);
    result = prime * result + (this.linear_acceleration == null ? 0 : this.linear_acceleration.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.linear_acceleration_covariance);
    return result;
  }
} // class Imu
