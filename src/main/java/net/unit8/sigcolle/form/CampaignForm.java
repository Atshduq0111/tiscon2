package net.unit8.sigcolle.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

import lombok.Data;

/**
 * @author kawasima
 */
@Data
public class CampaignForm extends FormBase {
    @DecimalMin("1")
    @DecimalMax("9999")

    private String userId;
    private String campaignId;
    private Long createUserId;

    //@NotNull
    //@Length(min = 1, max = 20)
    private String title;

    //@NotNull
    //@Length(min = 1, max = 20)
    private String statement;

    //@NotNull
    //@Length(min = 1, max = 20)
    private Long goal;



    public Long getCampaignIdLong() {
        return Long.parseLong(campaignId);
    }
}
