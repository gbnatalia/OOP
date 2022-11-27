cmake_minimum_required(VERSION 3.23)
project(lesson)

set(CMAKE_CXX_STANDARD 17)

add_executable(lesson main.cpp messager_struct.h CreatorUser.hpp CreatorChat.hpp MyMessanger.hpp MyController.hpp MyStorage.hpp  IStorage.hpp)
