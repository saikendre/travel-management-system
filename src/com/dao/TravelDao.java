package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Travel;
import com.util.MyConnection;

public class TravelDao 
{
	public int insertTravel (Travel t) 
	{
		int check=0;
		String sql="insert into travel(username,email,phone,message)values(?,?,?,?)";
		try (Connection con=MyConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(sql);)
		{
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getEmail());
			pst.setInt(3, t.getPhone());
			pst.setString(4, t.getMessage());
			check=pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
		return check;		
	}
}
