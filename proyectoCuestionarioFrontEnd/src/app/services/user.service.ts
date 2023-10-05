import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private HttpClient: HttpClient ) { }

  public registrarUsuario(user:any){
    return this.HttpClient.post(`${baseUrl}/usuarios/`, user)
  }
}
