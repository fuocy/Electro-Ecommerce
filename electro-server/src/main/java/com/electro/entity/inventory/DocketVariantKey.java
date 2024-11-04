package com.electro.entity.inventory;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class DocketVariantKey implements Serializable {
    @Column(name = "docket_id", nullable = false)
    Long docketId;

    @Column(name = "variant_id", nullable = false)
    Long variantId;
}
