package com.huazheng.springboot.study.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 代码生成表
 * @TableName gen_table
 */
@Data
public class GenTable implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 类名
     */
    private String className;

    /**
     * 说明
     */
    private String tableComment;

    /**
     * 作者
     */
    private String author;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 项目包名
     */
    private String packageName;

    /**
     * 项目版本号
     */
    private String version;

    /**
     * 生成方式  0：zip压缩包   1：自定义目录
     */
    private Integer generatorType;

    /**
     * 后端生成路径
     */
    private String backendPath;

    /**
     * 前端生成路径
     */
    private String frontendPath;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 功能名
     */
    private String functionName;

    /**
     * 表单布局  1：一列   2：两列
     */
    private Integer formLayout;

    /**
     * 数据源ID
     */
    private Long datasourceId;

    /**
     * 基类ID
     */
    private Long baseclassId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GenTable other = (GenTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getTableComment() == null ? other.getTableComment() == null : this.getTableComment().equals(other.getTableComment()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPackageName() == null ? other.getPackageName() == null : this.getPackageName().equals(other.getPackageName()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getGeneratorType() == null ? other.getGeneratorType() == null : this.getGeneratorType().equals(other.getGeneratorType()))
            && (this.getBackendPath() == null ? other.getBackendPath() == null : this.getBackendPath().equals(other.getBackendPath()))
            && (this.getFrontendPath() == null ? other.getFrontendPath() == null : this.getFrontendPath().equals(other.getFrontendPath()))
            && (this.getModuleName() == null ? other.getModuleName() == null : this.getModuleName().equals(other.getModuleName()))
            && (this.getFunctionName() == null ? other.getFunctionName() == null : this.getFunctionName().equals(other.getFunctionName()))
            && (this.getFormLayout() == null ? other.getFormLayout() == null : this.getFormLayout().equals(other.getFormLayout()))
            && (this.getDatasourceId() == null ? other.getDatasourceId() == null : this.getDatasourceId().equals(other.getDatasourceId()))
            && (this.getBaseclassId() == null ? other.getBaseclassId() == null : this.getBaseclassId().equals(other.getBaseclassId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getTableComment() == null) ? 0 : getTableComment().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getGeneratorType() == null) ? 0 : getGeneratorType().hashCode());
        result = prime * result + ((getBackendPath() == null) ? 0 : getBackendPath().hashCode());
        result = prime * result + ((getFrontendPath() == null) ? 0 : getFrontendPath().hashCode());
        result = prime * result + ((getModuleName() == null) ? 0 : getModuleName().hashCode());
        result = prime * result + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        result = prime * result + ((getFormLayout() == null) ? 0 : getFormLayout().hashCode());
        result = prime * result + ((getDatasourceId() == null) ? 0 : getDatasourceId().hashCode());
        result = prime * result + ((getBaseclassId() == null) ? 0 : getBaseclassId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tableName=").append(tableName);
        sb.append(", className=").append(className);
        sb.append(", tableComment=").append(tableComment);
        sb.append(", author=").append(author);
        sb.append(", email=").append(email);
        sb.append(", packageName=").append(packageName);
        sb.append(", version=").append(version);
        sb.append(", generatorType=").append(generatorType);
        sb.append(", backendPath=").append(backendPath);
        sb.append(", frontendPath=").append(frontendPath);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", functionName=").append(functionName);
        sb.append(", formLayout=").append(formLayout);
        sb.append(", datasourceId=").append(datasourceId);
        sb.append(", baseclassId=").append(baseclassId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}