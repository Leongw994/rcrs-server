package traffic;

import java.util.*;
import traffic.object.*;

public interface Constants {
  static final double UNIT_SEC = 1d;  // must be measure of 60 [sec]

  // MovingObject
  static final double MAX_VELOCITY_PER_SEC = 20d * 1000000d / 3600d;  // 20 [km/h]
  static final double ACCELERATING_SEC     = 5d;
  static final double MAX_ACCELERATION_PER_SEC = MAX_VELOCITY_PER_SEC / ACCELERATING_SEC;
  static final double MAX_VELOCITY     = MAX_VELOCITY_PER_SEC * UNIT_SEC;
  static final double MAX_ACCELERATION = Math.min(MAX_VELOCITY, MAX_ACCELERATION_PER_SEC * UNIT_SEC);

  static final double MAX_CIV_VELOCITY_PER_SEC = 3d * 1000000d / 3600d;  // 3 [km/h]
  static final double MAX_CIV_VELOCITY     = MAX_CIV_VELOCITY_PER_SEC * UNIT_SEC;
  static final double MAX_CIV_ACCELERATION = MAX_CIV_VELOCITY;

  static final double MAX_MAX_VELOCITY = MAX_VELOCITY;

  static final boolean OVERLOOK_EXCESSIVE_CHANGE_LANES = true;

  // Obstruction
  static final double MIN_SAFE_DISTANCE_BETWEEN_CIVILIAN  = 1000;
  static final double MIN_SAFE_DISTANCE_BETWEEN_CARS = 8000;

  static final double MAX_MIN_SAFE_DISTANCE = MIN_SAFE_DISTANCE_BETWEEN_CARS;

  // WorldModel
  static final WorldModel WORLD = new WorldModel();
  static final int INITIALIZING_TIME = 0;  //Integer.MIN_VALUE;

  static final boolean PRINT_REASON_WHY_AGENT_COMMAND_WAS_NOT_EXECUTED = false;

  // Lane
  static final boolean DRIVING_DIRECTION_IS_LEFT = true;//false;//

  // IO
  static final int PACKET_SIZE = 1472;  // [byte] {cf. send_udp_size @ RUN/config.txt}
  static final int DEFAULT_KERNEL_PORT = 6000;

  // Util
  static final boolean ASSERT = false;
  static final long RANDOM_SEED = 1234l;
  static final Random RANDOM = new Random(RANDOM_SEED);

  // Simulator
  static final int CALCULATING_LIMIT_MILLI_SEC = 400;

  // Viewer
  static final boolean USE_VIEWER = false;
  static final Viewer VIEWER = (USE_VIEWER) ? new Viewer() : null;
  static final int VIEWER_WAITING_TIME = (int) (100 * UNIT_SEC);  // [milli sec]
  static final int VIEWER_WIDTH  = 800;
  static final int VIEWER_HEIGHT = 600;
  static final int VIEWER_GAP = 50;
  static final int VIEWER_BUILDING_SIZE = 10;
  static final int VIEWER_HUMANOID_SIZE =  8;
  static final int VIEWER_BLOCK_SIZE    =  4;
  static final int VIEWER_NODE_SIZE     =  4;
  static final int VIEWER_ARROW_SIZE    =  8;
  static final boolean VIEWER_USE_REAL_LINE_WIDTH = false;
  static final double VIEWER_CONSTANT_LINE_WIDTH = 2000d;
  static final int BLOCKADE_INITIALIZING_TIME = 3;
}
