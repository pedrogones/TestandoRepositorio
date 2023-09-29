import { Component, OnInit, ViewChild } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatMenuTrigger } from '@angular/material/menu';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from 'src/app/auth-service.service';
import { ConfirmationDialogComponent } from 'src/app/confirmation-dialog/confirmation-dialog.component';
import { PacienteService } from 'src/app/pacienteService';
import { SharedService } from 'src/app/shared.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  nome!: string;
  idade!: string;
  email!: string;
  usuario!: string;
  senha!: string;
  alergico!: string;
  contato!: string;
  infoadd!: string;
  role: string = '';

  alergicoSim = false;
  alergicoNao = false;
  @ViewChild('menuButton')
  menuButton!: MatMenuTrigger;
  tipoUsuario: string = ''; // Inicialize com um valor padrão se necessário

  constructor(private pacienteService: PacienteService,private router: Router, private dialog: MatDialog, private route: ActivatedRoute, private sharedService: SharedService, private authService: AuthService) {}
  ngOnInit(): void {}
  openDialog(message: string){
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: message,
    });
 }

 login(usuario: string, senha: string) {
  console.log(usuario, senha)
  this.pacienteService.loginPaciente(usuario, senha).subscribe(
    (response) => {
      this.openDialog("Login bem sucedido");
      this.redirectHome();
    },
    (error) => {
      this.openDialog("Credenciais inválidas");
    }
  );
}


  redirectProntuario(){
    this.sharedService.redirectProntuario();
  }
  toggleMenu():void{
    this.menuButton.openMenu(); // Abre o menu ao clicar no ícone do menu
  }
  redirectHome(){
    this.sharedService.redirectHome();
  }
  redirectHomePaciente(){
    this.sharedService.redirectHomePaciente();
  }
  redirect(): void{
    console.log('entrou')
    this.sharedService.redirectCadastro()
  }
}
