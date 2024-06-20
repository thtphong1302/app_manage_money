package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FinancialCost {
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User useID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_category_id")
    private CostCategory costCategoryID;
    private Double costValue;
    private String description;
    private LocalDate dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_cost_id")
    private TypeCost typeCostID;
}
