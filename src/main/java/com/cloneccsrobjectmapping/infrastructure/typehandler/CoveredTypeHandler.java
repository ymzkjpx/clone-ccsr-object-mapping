package com.cloneccsrobjectmapping.infrastructure.typehandler;

import com.cloneccsrobjectmapping.domain.model.feature.Feature;
import com.cloneccsrobjectmapping.domain.model.specification.Covered;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoveredTypeHandler extends BaseTypeHandler<Covered> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Covered parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.name());
    }

    @Override
    public Covered getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public Covered getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Covered getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }

}
