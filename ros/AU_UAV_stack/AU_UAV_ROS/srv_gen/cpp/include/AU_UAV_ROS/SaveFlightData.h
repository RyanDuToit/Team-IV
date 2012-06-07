/* Auto-generated by genmsg_cpp for file /home/uav-team3/AU-UAV-ROS/AU_UAV_stack/AU_UAV_ROS/srv/SaveFlightData.srv */
#ifndef AU_UAV_ROS_SERVICE_SAVEFLIGHTDATA_H
#define AU_UAV_ROS_SERVICE_SAVEFLIGHTDATA_H
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

#include "ros/service_traits.h"




namespace AU_UAV_ROS
{
template <class ContainerAllocator>
struct SaveFlightDataRequest_ {
  typedef SaveFlightDataRequest_<ContainerAllocator> Type;

  SaveFlightDataRequest_()
  : filename()
  {
  }

  SaveFlightDataRequest_(const ContainerAllocator& _alloc)
  : filename(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _filename_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  filename;


private:
  static const char* __s_getDataType_() { return "AU_UAV_ROS/SaveFlightDataRequest"; }
public:
  ROS_DEPRECATED static const std::string __s_getDataType() { return __s_getDataType_(); }

  ROS_DEPRECATED const std::string __getDataType() const { return __s_getDataType_(); }

private:
  static const char* __s_getMD5Sum_() { return "030824f52a0628ead956fb9d67e66ae9"; }
public:
  ROS_DEPRECATED static const std::string __s_getMD5Sum() { return __s_getMD5Sum_(); }

  ROS_DEPRECATED const std::string __getMD5Sum() const { return __s_getMD5Sum_(); }

private:
  static const char* __s_getServerMD5Sum_() { return "fe8131f61ada79495e0d839037fe5bd9"; }
public:
  ROS_DEPRECATED static const std::string __s_getServerMD5Sum() { return __s_getServerMD5Sum_(); }

  ROS_DEPRECATED const std::string __getServerMD5Sum() const { return __s_getServerMD5Sum_(); }

private:
  static const char* __s_getMessageDefinition_() { return "string filename\n\
\n\
"; }
public:
  ROS_DEPRECATED static const std::string __s_getMessageDefinition() { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED const std::string __getMessageDefinition() const { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED virtual uint8_t *serialize(uint8_t *write_ptr, uint32_t seq) const
  {
    ros::serialization::OStream stream(write_ptr, 1000000000);
    ros::serialization::serialize(stream, filename);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint8_t *deserialize(uint8_t *read_ptr)
  {
    ros::serialization::IStream stream(read_ptr, 1000000000);
    ros::serialization::deserialize(stream, filename);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint32_t serializationLength() const
  {
    uint32_t size = 0;
    size += ros::serialization::serializationLength(filename);
    return size;
  }

  typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SaveFlightDataRequest
typedef  ::AU_UAV_ROS::SaveFlightDataRequest_<std::allocator<void> > SaveFlightDataRequest;

typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataRequest> SaveFlightDataRequestPtr;
typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataRequest const> SaveFlightDataRequestConstPtr;


template <class ContainerAllocator>
struct SaveFlightDataResponse_ {
  typedef SaveFlightDataResponse_<ContainerAllocator> Type;

  SaveFlightDataResponse_()
  : error()
  {
  }

  SaveFlightDataResponse_(const ContainerAllocator& _alloc)
  : error(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _error_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  error;


private:
  static const char* __s_getDataType_() { return "AU_UAV_ROS/SaveFlightDataResponse"; }
public:
  ROS_DEPRECATED static const std::string __s_getDataType() { return __s_getDataType_(); }

  ROS_DEPRECATED const std::string __getDataType() const { return __s_getDataType_(); }

private:
  static const char* __s_getMD5Sum_() { return "eca8b96616c32aacf1be8bbf14c70eba"; }
public:
  ROS_DEPRECATED static const std::string __s_getMD5Sum() { return __s_getMD5Sum_(); }

  ROS_DEPRECATED const std::string __getMD5Sum() const { return __s_getMD5Sum_(); }

private:
  static const char* __s_getServerMD5Sum_() { return "fe8131f61ada79495e0d839037fe5bd9"; }
public:
  ROS_DEPRECATED static const std::string __s_getServerMD5Sum() { return __s_getServerMD5Sum_(); }

  ROS_DEPRECATED const std::string __getServerMD5Sum() const { return __s_getServerMD5Sum_(); }

private:
  static const char* __s_getMessageDefinition_() { return "string error\n\
\n\
\n\
"; }
public:
  ROS_DEPRECATED static const std::string __s_getMessageDefinition() { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED const std::string __getMessageDefinition() const { return __s_getMessageDefinition_(); }

  ROS_DEPRECATED virtual uint8_t *serialize(uint8_t *write_ptr, uint32_t seq) const
  {
    ros::serialization::OStream stream(write_ptr, 1000000000);
    ros::serialization::serialize(stream, error);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint8_t *deserialize(uint8_t *read_ptr)
  {
    ros::serialization::IStream stream(read_ptr, 1000000000);
    ros::serialization::deserialize(stream, error);
    return stream.getData();
  }

  ROS_DEPRECATED virtual uint32_t serializationLength() const
  {
    uint32_t size = 0;
    size += ros::serialization::serializationLength(error);
    return size;
  }

  typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SaveFlightDataResponse
typedef  ::AU_UAV_ROS::SaveFlightDataResponse_<std::allocator<void> > SaveFlightDataResponse;

typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataResponse> SaveFlightDataResponsePtr;
typedef boost::shared_ptr< ::AU_UAV_ROS::SaveFlightDataResponse const> SaveFlightDataResponseConstPtr;

struct SaveFlightData
{

typedef SaveFlightDataRequest Request;
typedef SaveFlightDataResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct SaveFlightData
} // namespace AU_UAV_ROS

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "030824f52a0628ead956fb9d67e66ae9";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x030824f52a0628eaULL;
  static const uint64_t static_value2 = 0xd956fb9d67e66ae9ULL;
};

template<class ContainerAllocator>
struct DataType< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "AU_UAV_ROS/SaveFlightDataRequest";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string filename\n\
\n\
";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "eca8b96616c32aacf1be8bbf14c70eba";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xeca8b96616c32aacULL;
  static const uint64_t static_value2 = 0xf1be8bbf14c70ebaULL;
};

template<class ContainerAllocator>
struct DataType< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "AU_UAV_ROS/SaveFlightDataResponse";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string error\n\
\n\
\n\
";
  }

  static const char* value(const  ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.filename);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SaveFlightDataRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.error);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SaveFlightDataResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<AU_UAV_ROS::SaveFlightData> {
  static const char* value() 
  {
    return "fe8131f61ada79495e0d839037fe5bd9";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightData&) { return value(); } 
};

template<>
struct DataType<AU_UAV_ROS::SaveFlightData> {
  static const char* value() 
  {
    return "AU_UAV_ROS/SaveFlightData";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightData&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "fe8131f61ada79495e0d839037fe5bd9";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "AU_UAV_ROS/SaveFlightData";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightDataRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "fe8131f61ada79495e0d839037fe5bd9";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "AU_UAV_ROS/SaveFlightData";
  }

  static const char* value(const AU_UAV_ROS::SaveFlightDataResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // AU_UAV_ROS_SERVICE_SAVEFLIGHTDATA_H

