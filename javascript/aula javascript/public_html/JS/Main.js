
    /*
    var senha = 130290;
    var nome = "Jonatas";
    alert("meu nome é: " + nome + " e minha senha é; " + senha);
    alert(nome.replace("Jonatas", "Pedro"));
*/

/*var lista = ["Jonatas","Sevgerino","Silva"];
lista.push("melão");
console.log(lista[1]);
alert(lista[2]);
alert(lista.length);
*/

/*function soma (n1,n2){
    return n1 + n2;
}
function setReplace(frase,nome,novo_nome){
    return frase.replace(nome,novo_nome);
}

alert(soma(5,10));
alert(setReplace("eu sou pedro.", "pedro", "jonatas"));
*/

/*function validaIdade(idade){
    var mensagem;
    if(idade >= 18 ){
        mensagem = "você é de maior!. ";
    }else{
        mensagem = "você é de menor!.";
    }
    return mensagem;
    }//fim da função
var idade = prompt("qual sua idade? ");
console.log(validaIdade(idade));

*/

function botao(){
    document.getElementById("agradecimento").innerHTML = "<b>obrigado por clicar!!.</b>";
    //console.log(document.getElementById("agradecimento"));
     //alert("obrigado por clicar!! ");
}
function redirecionar(){
    window.open("https://br.op.gg/summoner/userName=veenonjony");
}

function trocar(){
    document.getElementById("mouse_move").innerHTML = "<b>obrigado por passar o mouse!!.</b>";
    //alert("trocar texto.");
}
function voltar(){
    document.getElementById("mouse_move").innerHTML = "<b>passe o mouse aqui!!.</b>";
}