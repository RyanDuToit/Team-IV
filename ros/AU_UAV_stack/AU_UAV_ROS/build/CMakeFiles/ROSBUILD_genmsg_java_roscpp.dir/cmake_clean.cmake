FILE(REMOVE_RECURSE
  "../msg_gen"
  "../srv_gen"
  "../src/AU_UAV_ROS/msg"
  "../src/AU_UAV_ROS/srv"
  "../msg_gen"
  "../srv_gen"
  "CMakeFiles/ROSBUILD_genmsg_java_roscpp"
  "../msg_gen/java/ros/pkg/roscpp/msg/Logger.java"
)

# Per-language clean rules from dependency scanning.
FOREACH(lang)
  INCLUDE(CMakeFiles/ROSBUILD_genmsg_java_roscpp.dir/cmake_clean_${lang}.cmake OPTIONAL)
ENDFOREACH(lang)
