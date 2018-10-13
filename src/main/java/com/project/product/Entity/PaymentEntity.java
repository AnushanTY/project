package com.project.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "Payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", updatable = false, nullable = false)
    private Long payment_id;

    @NotNull
    @Column(name = "amount")
    private String amount;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "job_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private JobEntity jobEntity;

    public Long getPayment_id() {
        return payment_id;
    }

    public String getAmount() {
        return amount;
    }

    public JobEntity getJobEntity() {
        return jobEntity;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setJobEntity(JobEntity jobEntity) {
        this.jobEntity = jobEntity;
    }
}
