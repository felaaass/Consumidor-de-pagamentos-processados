package com.example.trabalho06.adapter.out.persistence;

import com.example.trabalho06.core.domain.model.PedidoBO;
import com.example.trabalho06.core.ports.out.SalvarPedidoPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PedidoPersistenceAdapter implements SalvarPedidoPort {

    private static final Logger logger = LoggerFactory.getLogger(PedidoPersistenceAdapter.class);

    @Override
    public void salvar(PedidoBO pedido) {
        if (pedido.isDescontoAplicado()) {
            logger.info("Pedido {} processado. Valor original: R$ {} | Valor com Desconto: R$ {}",
                    pedido.getId(), pedido.getValorOriginal(), pedido.getValorFinal());
        } else {
            logger.info("Pedido {} processado. Valor original: R$ {} | Valor sem Desconto: R$ {}",
                    pedido.getId(), pedido.getValorOriginal(), pedido.getValorFinal());
        }
    }
}