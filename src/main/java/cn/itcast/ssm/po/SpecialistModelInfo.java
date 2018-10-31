package cn.itcast.ssm.po;

import java.io.Serializable;

public class SpecialistModelInfo implements Serializable {
    private Integer modelId;

    private String url;

    private String modelName;

    private String functionDeclaration;

    private static final long serialVersionUID = 1L;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(String functionDeclaration) {
        this.functionDeclaration = functionDeclaration == null ? null : functionDeclaration.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelId=").append(modelId);
        sb.append(", url=").append(url);
        sb.append(", modelName=").append(modelName);
        sb.append(", functionDeclaration=").append(functionDeclaration);
        sb.append("]");
        return sb.toString();
    }
}