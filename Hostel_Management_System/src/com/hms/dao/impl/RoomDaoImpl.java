package com.hms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hms.dao.RoomDao;
import com.hms.pojo.Room;

public class RoomDaoImpl implements RoomDao{
	
	private JdbcTemplate jt1;

	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	
	public int addRoom(Room r) {
		String sql = "INSERT INTO room(roomNumber, roomType,description,roomCapacity,checkInDate,checkOutDate,roomCost) VALUES(?,?,?,?,?,?,?)";
		return jt1.update(sql,r.getRoomNumber(), r.getRoomType(),r.getDescription(), r.getRoomCapacity(), r.getCheckInDate(), r.getCheckOutDate(),
				r.getRoomCost());
	}

	
	public List<Room> getAllRoom() {
		String getAll = "SELECT * FROM room";
		return jt1.query(getAll, new RowMapper<Room>() {
			@Override
			public Room mapRow(ResultSet rs, int in) throws SQLException {
				Room r = new Room(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
						rs.getInt(7));
				return r;
			}
		});
	}
	
	public List<Room> getAvailableRoom() {
		String getAll = "SELECT * FROM room WHERE checkInDate<=now() AND checkOutDate>=now()";
		return jt1.query(getAll, new RowMapper<Room>() {
			@Override
			public Room mapRow(ResultSet rs, int in) throws SQLException {
				Room r = new Room(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
						rs.getInt(7));
				return r;
			}
		});
	}

	public Room searchRoomByRoomNo(int roomnumber) {
		String getAll = "SELECT * FROM room WHERE roomNumber=?";
		return jt1.queryForObject(getAll, new Object[] { roomnumber }, new RowMapper<Room>() {
			@Override
			public Room mapRow(ResultSet rs, int in) throws SQLException {
				Room r = new Room(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
						rs.getInt(7));
				return r;
			}
		});
	}

	public List<Room> searchRoomFordate(String date) {
		String getAll = "SELECT * FROM room WHERE checkInDate<=? AND checkOutDate>=?";
		return jt1.query(getAll, new Object[] { date,date }, new RowMapper<Room>() {
			@Override
			public Room mapRow(ResultSet rs, int in) throws SQLException {
				Room c = new Room(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),
						rs.getInt(7));
				return c;
			}
		});
	}

	

}
