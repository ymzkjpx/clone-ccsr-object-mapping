package com.cloneccsrobjectmapping.infrastructure.typehandler;

import com.cloneccsrobjectmapping.domain.model.specification.CaseType;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CaseTypeTypeHandler extends BaseTypeHandler<CaseType> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, CaseType parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.name());
    }

    @Override
    public CaseType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public CaseType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public CaseType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
