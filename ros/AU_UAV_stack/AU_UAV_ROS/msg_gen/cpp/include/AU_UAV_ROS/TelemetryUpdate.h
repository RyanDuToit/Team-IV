/* Auto-generated by genmsg_cpp for file /home/uav-team3/AU-UAV-ROS/AU_UAV_stack/AU_UAV_ROS/msg/TelemetryUpdate.msg */
#ifndef AU_UAV_ROS_MESSAGE_TELEMETRYUPDATE_H
#define AU_UAV_ROS_MESSAGE_TELEMETRYUPDATE_H
#include <string>
#include <vector>
#include <map>
#include <ostream>
#include "ros/serialization.h"
#include "ros/builtin_message_traits.h"
#include "ros/message_operations.h"
#include "ros/time.h"

#include "ros/macros.h"

#include "ros/assert.h"

#include "std_msgs/Header.h"

namespace AU_UAV_ROS
{
template <class ContainerAllocator>
struct TelemetryUpdate_ {
  typedef TelemetryUpdate_<ContainerAllocator> Type;

  TelemetryUpdate_()
  : telemetryHeader()
  , planeID(0)
  , currentLatitude(0.0)
  , currentLongitude(0.0)
  , currentAltitude(0.0)
  , destLatitude(0.0)
  , destLongitude(0.0)
  , destAltitude(0.0)
  , groundSpeed(0.0)
  , targetBearing(0.0)
  , currentWaypointIndex(0)
  , distanceToDestination(0.0)
  {
  }

  TelemetryUpdate_(const ContainerAllocator& _alloc)
  : telemetryHeader(_alloc)
  , planeID(0)
  , currentLatitude(0.0)
  , currentLongitude(0.0)
  , currentAltitude(0.0)
  , destLatitude(0.0)
  , destLongitude(0.0)
  , destAltitude(0.0)
  , groundSpeed(0.0)
  , targetBearing(0.0)
  , currentWaypointIndex(0)
  , distanceToDestination(0.0)
  {
  }

  typedef  ::std_msgs::Header_<ContainerAllocator>  _telemetryHeader_type;
   ::std_msgs::Header_<ContainerAllocator>  telemetryHeader;

  typedef int32_t _planeID_type;
  int32_t planeID;

  typedef double _currentLatitude_type;
  double currentLatitude;

  typedef double _currentLongitude_type;
  double currentLongitude;

  typedef double _currentAltitude_type;
  double currentAltitude;

  typedef double _destLatitude_type;
  double destLatitude;

  typedef double _destLongitude_type;
  double destLongitude;

  typedef double _destAltitude_type;
  double destAltitude;

  typedef double _groundSpeed_type;
  double groundSpeed;

  typedef double _targetBearing_type;
  double targetBearing;

  typedef int64_t _currentWaypointIndex_type;
  int64_t currentWaypointIndex;

  typedef double _distanceToDestination_type;
  double distanceToDestination;


private:
  static const char* __s_getDataType_() { return "AU_UAV_ROS/TelemetryUpdate"; }
public:
  ROS_DEPRECATED static const std::string __s_getDataType() { return __s_getDataType_(); }

  ROS_DEPRECATED const std::string __getDataType() const { return __s_getDataType_(); }

private:
  static const char* __s_getMD5Sum_() { return "53cd950963d7a5c403c785f8c0a2ffa7"; }
public:
  ROS_DEPRECATED static const std::string __s_getMD5Sum() { return __s_getMD5Sum_(); }

  ROS_DEPRECATED const std::string __getMD5Sum() const { return __s_getMD5Sum_(); }

private:
  static const char* __s_getMessageDefinition_() { return "Header telemetryHeader\n\
int32 planeID\n\
float64 currentLatitude\n\
float64 currentLongitude\n\
float64 currentAltitude\n\
float64 destLatitude\n\
float64 destLongitude\n\
float64 destAltitude\n\
float64 groundSpeed\n\
float64 targetBearing\n\
int64 currentWaypointIndex\n\
float64 distanceToDestination\n\
\n\
================================================================================\n\
MSG: std_msgs/Header\n\
# Standard metadata for higher-level stamped data types.\n\
# This is generally used to communicate timestamped data \n\
# in a particular coordinate frame.\n\
# \n\
# sequence ID: consecutively increasing ID \n\
uint32 seq\n\
#Two-integer timestamp that is expressed as:\n\
# * stamp.secs: seconds (stamp_secs) since epoch\n\
# * stamp.nsecs: nanoseconds since stamp_secs\n\
# time-handling sugar is provided by the client library\n\
time stamp\n\
#Frame this data is associated with\n\
# 0: no frame\n\
# 1: global frame\n\
string frame_id\n\
\n\
"; }
public:
  ROS_DEPRECATED static const std::string __s_getMessageDefinition() { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED const std::string __getMessageDefinition() const { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED virtual uint8_t *serialize(uint8_t *write_ptr, uint32_t seq) const
  {
    ros::serialization::OStream stream(write_ptr, 1000000000);
    ros::serialization::serialize(stream, telemetryHeader);
    ros::serialization::serialize(stream, planeID);
    ros::serialization::serialize(stream, currentLatitude);
    ros::serialization::serialize(stream, currentLongitude);
    ros::serialization::serialize(stream, currentAltitude);
    ros::serialization::serialize(stream, destLatitude);
    ros::serialization::serialize(stream, destLongitude);
    ros::serialization::serialize(stream, destAltitude);
    ros::serialization::serialize(stream, groundSpeed);
    ros::serialization::serialize(stream, targetBearing);
    ros::serialization::serialize(stream, currentWaypointIndex);
    ros::serialization::serialize(stream, distanceToDestination);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint8_t *deserialize(uint8_t *read_ptr)
  {
    ros::serialization::IStream stream(read_ptr, 1000000000);
    ros::serialization::deserialize(stream, telemetryHeader);
    ros::serialization::deserialize(stream, planeID);
    ros::serialization::deserialize(stream, currentLatitude);
    ros::serialization::deserialize(stream, currentLongitude);
    ros::serialization::deserialize(stream, currentAltitude);
    ros::serialization::deserialize(stream, destLatitude);
    ros::serialization::deserialize(stream, destLongitude);
    ros::serialization::deserialize(stream, destAltitude);
    ros::serialization::deserialize(stream, groundSpeed);
    ros::serialization::deserialize(stream, targetBearing);
    ros::serialization::deserialize(stream, currentWaypointIndex);
    ros::serialization::deserialize(stream, distanceToDestination);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint32_t serializationLength() const
  {
    uint32_t size = 0;
    size += ros::serialization::serializationLength(telemetryHeader);
    size += ros::serialization::serializationLength(planeID);
    size += ros::serialization::serializationLength(currentLatitude);
    size += ros::serialization::serializationLength(currentLongitude);
    size += ros::serialization::serializationLength(currentAltitude);
    size += ros::serialization::serializationLength(destLatitude);
    size += ros::serialization::serializationLength(destLongitude);
    size += ros::serialization::serializationLength(destAltitude);
    size += ros::serialization::serializationLength(groundSpeed);
    size += ros::serialization::serializationLength(targetBearing);
    size += ros::serialization::serializationLength(currentWaypointIndex);
    size += ros::serialization::serializationLength(distanceToDestination);
    return size;
  }

  typedef boost::shared_ptr< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct TelemetryUpdate
typedef  ::AU_UAV_ROS::TelemetryUpdate_<std::allocator<void> > TelemetryUpdate;

typedef boost::shared_ptr< ::AU_UAV_ROS::TelemetryUpdate> TelemetryUpdatePtr;
typedef boost::shared_ptr< ::AU_UAV_ROS::TelemetryUpdate const> TelemetryUpdateConstPtr;


template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const  ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> & v)
{
  ros::message_operations::Printer< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> >::stream(s, "", v);
  return s;}

} // namespace AU_UAV_ROS

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> > {
  static const char* value() 
  {
    return "53cd950963d7a5c403c785f8c0a2ffa7";
  }

  static const char* value(const  ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x53cd950963d7a5c4ULL;
  static const uint64_t static_value2 = 0x03c785f8c0a2ffa7ULL;
};

template<class ContainerAllocator>
struct DataType< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> > {
  static const char* value() 
  {
    return "AU_UAV_ROS/TelemetryUpdate";
  }

  static const char* value(const  ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> > {
  static const char* value() 
  {
    return "Header telemetryHeader\n\
int32 planeID\n\
float64 currentLatitude\n\
float64 currentLongitude\n\
float64 currentAltitude\n\
float64 destLatitude\n\
float64 destLongitude\n\
float64 destAltitude\n\
float64 groundSpeed\n\
float64 targetBearing\n\
int64 currentWaypointIndex\n\
float64 distanceToDestination\n\
\n\
================================================================================\n\
MSG: std_msgs/Header\n\
# Standard metadata for higher-level stamped data types.\n\
# This is generally used to communicate timestamped data \n\
# in a particular coordinate frame.\n\
# \n\
# sequence ID: consecutively increasing ID \n\
uint32 seq\n\
#Two-integer timestamp that is expressed as:\n\
# * stamp.secs: seconds (stamp_secs) since epoch\n\
# * stamp.nsecs: nanoseconds since stamp_secs\n\
# time-handling sugar is provided by the client library\n\
time stamp\n\
#Frame this data is associated with\n\
# 0: no frame\n\
# 1: global frame\n\
string frame_id\n\
\n\
";
  }

  static const char* value(const  ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.telemetryHeader);
    stream.next(m.planeID);
    stream.next(m.currentLatitude);
    stream.next(m.currentLongitude);
    stream.next(m.currentAltitude);
    stream.next(m.destLatitude);
    stream.next(m.destLongitude);
    stream.next(m.destAltitude);
    stream.next(m.groundSpeed);
    stream.next(m.targetBearing);
    stream.next(m.currentWaypointIndex);
    stream.next(m.distanceToDestination);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct TelemetryUpdate_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const  ::AU_UAV_ROS::TelemetryUpdate_<ContainerAllocator> & v) 
  {
    s << indent << "telemetryHeader: ";
s << std::endl;
    Printer< ::std_msgs::Header_<ContainerAllocator> >::stream(s, indent + "  ", v.telemetryHeader);
    s << indent << "planeID: ";
    Printer<int32_t>::stream(s, indent + "  ", v.planeID);
    s << indent << "currentLatitude: ";
    Printer<double>::stream(s, indent + "  ", v.currentLatitude);
    s << indent << "currentLongitude: ";
    Printer<double>::stream(s, indent + "  ", v.currentLongitude);
    s << indent << "currentAltitude: ";
    Printer<double>::stream(s, indent + "  ", v.currentAltitude);
    s << indent << "destLatitude: ";
    Printer<double>::stream(s, indent + "  ", v.destLatitude);
    s << indent << "destLongitude: ";
    Printer<double>::stream(s, indent + "  ", v.destLongitude);
    s << indent << "destAltitude: ";
    Printer<double>::stream(s, indent + "  ", v.destAltitude);
    s << indent << "groundSpeed: ";
    Printer<double>::stream(s, indent + "  ", v.groundSpeed);
    s << indent << "targetBearing: ";
    Printer<double>::stream(s, indent + "  ", v.targetBearing);
    s << indent << "currentWaypointIndex: ";
    Printer<int64_t>::stream(s, indent + "  ", v.currentWaypointIndex);
    s << indent << "distanceToDestination: ";
    Printer<double>::stream(s, indent + "  ", v.distanceToDestination);
  }
};


} // namespace message_operations
} // namespace ros

#endif // AU_UAV_ROS_MESSAGE_TELEMETRYUPDATE_H

