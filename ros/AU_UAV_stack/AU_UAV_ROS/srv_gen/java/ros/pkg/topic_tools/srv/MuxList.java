/* Auto-generated by genmsg_cpp for file /opt/ros/electric/stacks/ros_comm/tools/topic_tools/srv/MuxList.srv */

package ros.pkg.topic_tools.srv;

import java.nio.ByteBuffer;


public class MuxList extends ros.communication.Service<MuxList.Request, MuxList.Response> {

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxList"; }
  public static java.lang.String __s_getMD5Sum() { return "b0eef9a05d4e829092fc2f2c3c2aad3d"; }

  public java.lang.String getDataType() { return MuxList.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return MuxList.__s_getMD5Sum(); }

  public MuxList.Request createRequest() {
    return new MuxList.Request();
  }

  public MuxList.Response createResponse() {
    return new MuxList.Response();
  }

static public class Request extends ros.communication.Message {


  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxListRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d41d8cd98f00b204e9800998ecf8427e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "b0eef9a05d4e829092fc2f2c3c2aad3d"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
  }

  public void deserialize(ByteBuffer bb) {
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public java.util.ArrayList<java.lang.String> topics = new java.util.ArrayList<java.lang.String>();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxListResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "b0eef9a05d4e829092fc2f2c3c2aad3d"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "b0eef9a05d4e829092fc2f2c3c2aad3d"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string[] topics\n" +
"\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(java.lang.String val : topics) {
      __l += 4 + val.length();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(topics.size());
    for(java.lang.String val : topics) {
      Serialization.writeString(bb, val);
    }
  }

  public void deserialize(ByteBuffer bb) {

    int __topics_len = bb.getInt();
    topics = new java.util.ArrayList<java.lang.String>(__topics_len);
    for(int __i=0; __i<__topics_len; __i++) {
      topics.add(Serialization.readString(bb));
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      topics.equals(other.topics) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.topics == null ? 0 : this.topics.hashCode());
    return result;
  }
} // class Response

} //class

