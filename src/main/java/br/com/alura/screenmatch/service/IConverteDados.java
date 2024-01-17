package br.com.alura.screenmatch.service;

public interface IConverteDados {
    // <T> representa que obterDados espera receber dados genéricos.
    // Na criação da class eu passo o que eu quero Class <T> classe
    <T> T obterDados (String json, Class<T> classe);
}
