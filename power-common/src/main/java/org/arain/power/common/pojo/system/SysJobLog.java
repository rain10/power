package org.arain.power.common.pojo.system;

import java.util.Date;

public class SysJobLog {
    private Long id;

    private Long jobId;

    private String timeConsuming;

    private Long jobSuccess;

    private String jobExceptipn;

    private Date startTime;

    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming == null ? null : timeConsuming.trim();
    }

    public Long getJobSuccess() {
        return jobSuccess;
    }

    public void setJobSuccess(Long jobSuccess) {
        this.jobSuccess = jobSuccess;
    }

    public String getJobExceptipn() {
        return jobExceptipn;
    }

    public void setJobExceptipn(String jobExceptipn) {
        this.jobExceptipn = jobExceptipn == null ? null : jobExceptipn.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}