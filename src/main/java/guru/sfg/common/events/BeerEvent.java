package guru.sfg.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
//Se nescesita un constructor con todos los parametros para la herencia
@AllArgsConstructor
@Builder
//Jackson nescesita un constructor vacio
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 3738942033667389581L;
    private BeerDto beerDto;
}
